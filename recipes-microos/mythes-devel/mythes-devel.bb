SUMMARY = "Files for Developing with mythes"
DESCRIPTION = "MyThes is a simple thesaurus that uses a structured text data file and an \
index file with binary search to look up words and phrases and return \
information on part of speech, meanings, and synonyms. \
 \
This package contains the mythes development files."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "mythes-devel-1.2.5-1.2.aarch64.rpm"
RPM_HASH = "0a95324a7138f36f8295220a90decc437289f54e10c57f33d657562298a37547fd4afdd923239f3aac353f3cce55c997d4ba3292b0410ea3194a4d3ffc3efa88"

RPROVIDES:${PN} += "mythes-devel mythes-devel(aarch-64) pkgconfig(mythes)"
RDEPENDS:${PN} += "/usr/bin/perl /usr/bin/pkg-config libmythes-1_2-0"

inherit rpm
