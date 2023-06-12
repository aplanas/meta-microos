SUMMARY = "Multi volume file wrapper library"
DESCRIPTION = "A python library to provide a file-object wrapping multiple files as virtually like as \
a single file. It inherit io.RawIOBase class and support some of its standard methods."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.3"

RPM_NAME = "python311-multivolumefile-0.2.3-1.3.noarch.rpm"
RPM_HASH = "2768810d84b3ec0a7b4f4c0d3e90f8751b884cb6625ed764a0ef5fcad8bca5e06d3abb50a019cf93769d804f5f08b2882f4b6a143ab7b7ad48190698c0cb1e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(multivolumefile) \
python311-multivolumefile \
python3dist(multivolumefile)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
