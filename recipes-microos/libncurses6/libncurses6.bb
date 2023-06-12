SUMMARY = "Terminal control library"
DESCRIPTION = "The ncurses library is used by many terminal applications for \
controlling output to the screen and input from the user. \
 \
This package contains the library built with the version 6 ABI."
LICENSE = "MIT"

PV = "6.4.20230520"

RPM_NAME = "libncurses6-6.4.20230520-13.1.aarch64.rpm"
RPM_HASH = "e9295f97c0174be22d4e2b58bf962d34e8ff29feef3385a9d549ddb85e213a0f481819d5cabfcfe866b575013df1fb3581217d0d1b4766e81dc04bd5fcc945d3"

RPROVIDES:${PN} += "libform.so.6()(64bit) \
libform.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libform.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libform.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libform.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libform.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libform.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libform.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libform.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libform.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libform.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libform.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libform.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libform.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libform.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libform.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libform.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libform.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libform.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libform.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libform.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libform.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libform.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libform.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libform.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libform.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libformw.so.6()(64bit) \
libformw.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libformw.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libformw.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libformw.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libformw.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libformw.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libformw.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libformw.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libformw.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libformw.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libformw.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libformw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libformw.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libformw.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libformw.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libformw.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libmenu.so.6()(64bit) \
libmenu.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libmenu.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libmenu.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libmenu.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libmenu.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libmenu.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libmenu.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libmenu.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libmenu.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libmenu.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libmenu.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libmenu.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libmenu.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libmenu.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libmenu.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libmenu.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libmenuw.so.6()(64bit) \
libmenuw.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libmenuw.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libmenuw.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libmenuw.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libmenuw.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libmenuw.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libmenuw.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libmenuw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libmenuw.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libmenuw.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libmenuw.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libmenuw.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libncurses++.so.6()(64bit) \
libncurses++w.so.6()(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libncurses.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libncurses.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libncurses.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libncurses.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libncurses.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libncurses.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libncurses.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libncurses.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libncurses.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libncurses.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libncurses.so.6(NCURSEST6_5.8.20110226)(64bit) \
libncurses.so.6(NCURSEST6_5.9.20150530)(64bit) \
libncurses.so.6(NCURSEST6_6.1.20171230)(64bit) \
libncurses.so.6(NCURSEST6_6.2.20200212)(64bit) \
libncurses6 \
libncurses6(aarch-64) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libncursesw.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libncursesw.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libncursesw.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libncursesw.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libncursesw.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libncursesw.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libncursesw.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libncursesw.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libncursesw.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libncursesw.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libpanel.so.6()(64bit) \
libpanel.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libpanel.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libpanel.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libpanel.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libpanel.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libpanel.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libpanel.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libpanel.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libpanel.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libpanel.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libpanel.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libpanel.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpanel.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libpanel.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libpanel.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libpanel.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libpanelw.so.6()(64bit) \
libpanelw.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libpanelw.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libpanelw.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libpanelw.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libpanelw.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libpanelw.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libpanelw.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libpanelw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpanelw.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libpanelw.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libpanelw.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libpanelw.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libtic.so.6()(64bit) \
libtic.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libtic.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libtic.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libtic.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libtic.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libtic.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libtic.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libtic.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libtic.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libtic.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libtic.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libtic.so.6(NCURSEST6_5.7.20081102)(64bit) \
libtic.so.6(NCURSEST6_5.8.20110226)(64bit) \
libtic.so.6(NCURSEST6_5.9.20150530)(64bit) \
libtic.so.6(NCURSEST6_6.1.20171230)(64bit) \
libtic.so.6(NCURSEST6_6.2.20200212)(64bit) \
libticw.so.6()(64bit) \
libticw.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libticw.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libticw.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libticw.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libticw.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libticw.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libticw.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libticw.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libticw.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libticw.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libticw.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libticw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libticw.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libticw.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libticw.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libticw.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libtinfo.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libtinfo.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libtinfo.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libtinfo.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libtinfo.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfo.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libtinfo.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libtinfo.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libtinfo.so.6(NCURSESTW6_6.2.20200212)(64bit) \
libtinfow.so.6()(64bit) \
libtinfow.so.6(NCURSES6_TIC_5.0.19991023)(64bit) \
libtinfow.so.6(NCURSES6_TIC_5.1.20000708)(64bit) \
libtinfow.so.6(NCURSES6_TIC_5.5.20051010)(64bit) \
libtinfow.so.6(NCURSES6_TIC_5.7.20081102)(64bit) \
libtinfow.so.6(NCURSES6_TIC_5.9.20150530)(64bit) \
libtinfow.so.6(NCURSES6_TIC_6.1.20171230)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.1.20000708)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.2.20001021)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.3.20021019)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.4.20040208)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.5.20051010)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.6.20061217)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.8.20110226)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_5.9.20150530)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_6.1.20171230)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_6.2.20200212)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_6.2.20211010)(64bit) \
libtinfow.so.6(NCURSES6_TINFO_6.4.current)(64bit) \
libtinfow.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libtinfow.so.6(NCURSESTW6_5.8.20110226)(64bit) \
libtinfow.so.6(NCURSESTW6_5.9.20150530)(64bit) \
libtinfow.so.6(NCURSESTW6_6.1.20171230)(64bit) \
libtinfow.so.6(NCURSESTW6_6.2.20200212)(64bit) \
ncurses"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
terminfo-base"

inherit rpm
