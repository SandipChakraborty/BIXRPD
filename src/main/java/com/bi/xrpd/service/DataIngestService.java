package com.bi.xrpd.service;

import com.bi.xrpd.event.AddSysEntryReqEvent;
import com.bi.xrpd.event.AddSysEntryResEvent;

/**
 * @author SA377248
 *
 */
public interface DataIngestService {

	AddSysEntryResEvent addSysEntry(AddSysEntryReqEvent addSysEntryReqEvent);
}
