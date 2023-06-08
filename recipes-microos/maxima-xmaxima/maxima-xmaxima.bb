SUMMARY = "Tcl/Tk interface to Maxima"
DESCRIPTION = "A graphical interface to the Maxima symbolic computation program. It \
also provides Openmath, a graphics program that can be used from \
Maxima, and a Web browser that accepts a custom html tag to execute \
Maxima commands from an html page. \
 \
Xmaxima is written in the Tcl/Tk language."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-xmaxima-5.46.0-1.19.aarch64.rpm"
RPM_HASH = "395db0284cfe6b6367fb7b713b74214ad6eeab700ed298a241a3b938b4daa83e5e5fd5306e029f4071a9b75094cad1ad1760c022e4b1d52c4286d92df2ed4c08"

RPROVIDES:${PN} += "application() application(net.sourceforge.maxima.xmaxima.desktop) maxima-xmaxima maxima-xmaxima(aarch-64) metainfo() metainfo(net.sourceforge.maxima.xmaxima.appdata.xml) xmaxima"
RDEPENDS:${PN} += "/bin/sh maxima tk"

inherit rpm
