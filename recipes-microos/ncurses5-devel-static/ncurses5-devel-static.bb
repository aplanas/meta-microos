SUMMARY = "Static libraries for the ncurses5 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 5 form."
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "ncurses5-devel-static-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "e80e552b6b99ab1fd02fbe7a3b369768c161b2526a530996feae042c7ec530ebd925a59327d6fdabd253480b01eec982297440baf0d526b2bd3cb7a583cc01eb"

RPROVIDES:${PN} += "ncurses5-devel-static ncurses5-devel-static(aarch-64) ncurses5-devel:/usr/lib64/ncurses5/libform.a ncurses5-devel:/usr/lib64/ncurses5/libformw.a ncurses5-devel:/usr/lib64/ncurses5/libmenu.a ncurses5-devel:/usr/lib64/ncurses5/libmenuw.a ncurses5-devel:/usr/lib64/ncurses5/libncurses++.a ncurses5-devel:/usr/lib64/ncurses5/libncurses++w.a ncurses5-devel:/usr/lib64/ncurses5/libncurses.a ncurses5-devel:/usr/lib64/ncurses5/libncursesw.a ncurses5-devel:/usr/lib64/ncurses5/libpanel.a ncurses5-devel:/usr/lib64/ncurses5/libpanelw.a ncurses5-devel:/usr/lib64/ncurses5/libtic.a ncurses5-devel:/usr/lib64/ncurses5/libticw.a ncurses5-devel:/usr/lib64/ncurses5/libtinfo.a"
RDEPENDS:${PN} += "ncurses5-devel"

inherit rpm
