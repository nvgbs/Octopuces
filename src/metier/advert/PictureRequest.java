package metier.advert;

import java.util.List;

import base.dao.DaoFactory;
import model.advert.Picture;

public class PictureRequest
{

	public static List <Picture> getListPicture(Integer advertId) throws Exception
	{
		return DaoFactory.getDaoPicture().readByAdvertId(advertId.intValue());
	}
}
