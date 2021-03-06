package rg.sso.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
/**
 * @Title:TicketUtil
 * @Description:令牌缓存
 * @author 张颖辉
 * @date 2017年9月8日上午10:12:09
 * @version 1.0
 */
public class TicketUtil {

	private static Map<String, String> TICKET_CACHE = new HashMap<>();

	public static void put(String ticket, String account) {
		TICKET_CACHE.put(ticket, account);

	}

	public static String get(String ticket) {
		return TICKET_CACHE.get(ticket);

	}

	public static void remove(String ticket) {
		TICKET_CACHE.remove(ticket);

	}
}
