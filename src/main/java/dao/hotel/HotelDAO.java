package dao.hotel;

import java.util.List;
import modelo.Hotel;

public interface HotelDAO {

    public boolean salvar(Hotel hotel);

    public Hotel consultarPK(int hotelid);

    public boolean apagarPK(int hotelid);

    public List consultarTudo();

    public int reajuste(double percentual);
}
