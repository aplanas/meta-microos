SUMMARY = "Command Line Tool to Process XML Documents"
DESCRIPTION = "XMLStarlet (xml) is a command line XML toolkit which can be used to \
transform, query, validate, and edit XML documents and files using simple \
set of shell commands in similar way it is done for plain text files using \
'grep', 'sed', 'awk', 'tr', 'diff', or 'patch'."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "xmlstarlet-1.6.1-1.24.aarch64.rpm"
RPM_HASH = "79027ce7f21d878ec9209f5a0bbd37a0f5b6ee1c7ea155c10c4b16050917ad6f62c3d70451bca265117b9cb4a44f0e0a5447f185f0e915c36a68a7aa24cf096f"

RPROVIDES:${PN} += "xmlstarlet xmlstarlet(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexslt.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.17)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.0.22)(64bit) libxslt.so.1(LIBXML2_1.0.24)(64bit)"

inherit rpm
