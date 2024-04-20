package dao.hotel;

import dao.Conexao;
import dao.DadosBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Hotel;

public class HotelDAOMySQL implements HotelDAO {

    public boolean salvar(Hotel hotel) {
        boolean resultado = false;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        try {
            String sql = null;
            if (hotel.getHotelId() != -1) {
                sql = "update hotel set NOME = ?, CIDADE = ?, QUARTOS=?, VALORDIARIA=?, ESTRELAS=? where HOTELID = ?";
            } else {
                sql = "insert into hotel (NOME, CIDADE, QUARTOS, VALORDIARIA, ESTRELAS)  values  (?,?,?,?,?)";
            }
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, hotel.getNome());
            pstmt.setString(2, hotel.getCidade());
            pstmt.setInt(3, hotel.getQuartos());
            pstmt.setDouble(4, hotel.getValorDiaria());
            pstmt.setInt(5, hotel.getEstrelas());
            if (hotel.getHotelId() != -1) {
                pstmt.setInt(6, hotel.getHotelId());
            }

            pstmt.executeUpdate();
            resultado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultado;
    }

    public List consultarTudo() {
        Hotel hotel = null;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Hotel> lista = new ArrayList<Hotel>();
        try {
            String sql = "select * from hotel";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                hotel = new Hotel();
                hotel.setHotelId(rs.getInt("hotelid"));
                hotel.setNome(rs.getString("nome"));
                hotel.setCidade(rs.getString("cidade"));
                hotel.setQuartos(rs.getInt("quartos"));
                hotel.setValorDiaria(rs.getDouble("valordiaria"));
                hotel.setEstrelas(rs.getInt("estrelas"));
                lista.add(hotel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return lista;
    }

    public boolean apagarPK(int hotelid) {
        boolean resultado = false;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        try {
            String sql = "delete from hotel where hotelid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, hotelid);
            pstmt.executeUpdate();
            resultado = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultado;
    }

    public Hotel consultarPK(int hotelid) {
        Hotel hotel = null;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String sql = "select * from hotel where hotelid = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, hotelid);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                hotel = new Hotel();
                hotel.setHotelId(rs.getInt("hotelId"));
                hotel.setNome(rs.getString("nome"));
                hotel.setCidade(rs.getString("cidade"));
                hotel.setQuartos(rs.getInt("quartos"));
                hotel.setValorDiaria(rs.getDouble("valordiaria"));
                hotel.setEstrelas(rs.getInt("estrelas"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return hotel;
    }

    public int reajuste(double percentual) {
        int resultado = 0;
        Conexao MinhaConexao = new Conexao(DadosBanco.SERVIDOR, DadosBanco.DATABASE, DadosBanco.USUARIO, DadosBanco.SENHA);
        MinhaConexao.conectar();
        Connection conn = MinhaConexao.getCon();
        PreparedStatement pstmt = null;
        try {
            String sql = "update hotel set valorDiaria =  valorDiaria + valorDiaria * ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, percentual / 100.0);
            resultado = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultado;
    }
}
