SUMMARY = "Convert HTML to text with hyperlink references"
DESCRIPTION = "Simple program for viewing HTML in the terminal. \
 \
It displays hyperlinks as footnotes. \
 \
.mailcap: \
text/html; vilistextum -ul --charset %{charset} - - ; copiousoutput;"
LICENSE = "GPL-2.0-only"

PV = "2.6.9"

RPM_NAME = "vilistextum-2.6.9-1.10.aarch64.rpm"
RPM_HASH = "2ecf800b64ff50045ae768aa39edf31a45bead6426f271a2130accf6e0775c3b8a3ac461a4042592cb98e2234cd8d5dece4d20b43984decb32ba848a3625d317"

RPROVIDES:${PN} += "vilistextum vilistextum(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
