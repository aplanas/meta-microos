SUMMARY = "The Tcl Programming Language"
DESCRIPTION = "Tcl (Tool Command Language) is a very powerful but easy to learn \
dynamic programming language, suitable for a very wide range of uses, \
including web and desktop applications, networking, administration, \
testing and many more. Open source and business-friendly, Tcl is a \
mature yet evolving language that is truly cross platform, easily \
deployed and highly extensible. \
 \
For more information on Tcl see http://www.tcl.tk and \
http://wiki.tcl.tk ."
LICENSE = "TCL"

PV = "8.6.13"

RPM_NAME = "tcl-8.6.13-5.1.aarch64.rpm"
RPM_HASH = "4e166a78d11fb8a3ebaf48d1a85133b4a9fac9b7b21d01f3d9d36e8258d4d9d62a753d51a6137057926fc95be74047515b51b2e4dc99759938eafe46d32e2db3"

RPROVIDES:${PN} += "itcl libitcl4.2.3.so()(64bit) libtcl8.6.so()(64bit) libtdbc1.1.5.so()(64bit) libtdbcmysql1.1.5.so()(64bit) libtdbcodbc1.1.5.so()(64bit) libtdbcpostgres1.1.5.so()(64bit) libthread2.8.8.so()(64bit) rpm_macro(tcl_archdir) rpm_macro(tcl_noarchdir) rpm_macro(tcl_version) rpm_macro(tclscriptdir) tcl tcl(aarch-64) tclsh tclsh8.6"
RDEPENDS:${PN} += "/bin/rm /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libz.so.1(ZLIB_1.2.2)(64bit) sqlite3-tcl"

inherit rpm
