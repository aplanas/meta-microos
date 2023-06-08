SUMMARY = "Sound Conversion Tools and Library"
DESCRIPTION = "SOX is intended to be the Swiss Army knife of sound processing tools. \
It does many things, it just does not do them all well. Sooner or later \
it will come in very handy. SOX is really only usable day-to-day if you \
hide the wacky options with one-line shell scripts."
LICENSE = "LGPL-2.1+ & GPL-2.0+"

PV = "14.4.2"

RPM_NAME = "sox-devel-14.4.2-5.31.aarch64.rpm"
RPM_HASH = "944141733b46feef8bd146b0e076671e369339ce240415ab125eb6db4c720863388abf0ab15d07119f1cccdb508b03f05ee00005e8c0c2215e4ecfd628033a49"

RPROVIDES:${PN} += "pkgconfig(sox) sox-devel sox-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsox3"

inherit rpm
