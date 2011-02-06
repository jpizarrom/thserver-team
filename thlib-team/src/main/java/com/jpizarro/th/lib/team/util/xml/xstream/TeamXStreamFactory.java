package com.jpizarro.th.lib.team.util.xml.xstream;

import com.jpizarro.th.lib.generic.util.exception.THException;
import com.jpizarro.th.lib.generic.util.xml.xstream.CalendarConverter;
import com.jpizarro.th.lib.generic.util.xml.xstream.XStreamFactory;
import com.jpizarro.th.lib.team.entity.TeamTO;
import com.jpizarro.th.lib.team.entity.list.TeamsTO;
import com.jpizarro.th.lib.user.entity.UserTO;
import com.jpizarro.th.lib.user.entity.list.UsersTO;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class TeamXStreamFactory implements XStreamFactory
{
	public XStream createXStream()
	{
//		XStream xstream = new XStream(new DomDriver());
		XStream xstream = new XStream(new XppDriver());
		
		xstream.registerConverter(new CalendarConverter(), XStream.PRIORITY_VERY_HIGH);
//		xstream.registerConverter(new JoinedConverter(), XStream.PRIORITY_NORMAL);

		xstream.addImplicitCollection(TeamsTO.class, "teams", TeamTO.class);
		xstream.addImplicitCollection(UsersTO.class, "users", UserTO.class);
		

		
		xstream.alias("user", UserTO.class);

		xstream.alias("team", TeamTO.class);
		
	
		xstream.alias("teams", TeamsTO.class);
		xstream.alias("users", UsersTO.class);
		
		
		xstream.aliasField("users", TeamTO.class, "userTOList");
		
		xstream.alias("exception", THException.class);
		
		return xstream;
	}

}
