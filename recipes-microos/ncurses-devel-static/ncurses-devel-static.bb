SUMMARY = "Static libraries for the ncurses6 terminal control library"
DESCRIPTION = "This package contains the static library files for \
the ncurses library in its ABI version 6 form."
LICENSE = "MIT"

PV = "6.4.20230429"

RPM_NAME = "ncurses-devel-static-6.4.20230429-11.1.aarch64.rpm"
RPM_HASH = "86508b399f5abeab5a1de3b53d6661409e884156121f3b6baf232cab7160986611cb92df4faf277164f82a8b094fa8f7aa04caca8cffc2e226480ded2b6a9912"

RPROVIDES:${PN} += "ncurses-devel-static ncurses-devel-static(aarch-64) ncurses-devel:/usr/lib64/libform.a ncurses-devel:/usr/lib64/libformw.a ncurses-devel:/usr/lib64/libmenu.a ncurses-devel:/usr/lib64/libmenuw.a ncurses-devel:/usr/lib64/libncurses++.a ncurses-devel:/usr/lib64/libncurses++w.a ncurses-devel:/usr/lib64/libncurses.a ncurses-devel:/usr/lib64/libncursesw.a ncurses-devel:/usr/lib64/libpanel.a ncurses-devel:/usr/lib64/libpanelw.a ncurses-devel:/usr/lib64/libtic.a ncurses-devel:/usr/lib64/libticw.a ncurses-devel:/usr/lib64/libtinfo.a"
RDEPENDS:${PN} += "ncurses-devel"

inherit rpm
