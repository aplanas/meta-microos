SUMMARY = "Python adapter for universal, libarchive-based archive access"
DESCRIPTION = "A ctypes-based adapter to libarchive. \
7-Zip is supported for both reading and writing."
LICENSE = "GPL-2.0-only"

PV = "0.4.7"

RPM_NAME = "python310-libarchive-0.4.7-3.12.noarch.rpm"
RPM_HASH = "0b8c50db1f3ad8cf085dcdb9b4f1bc88983567d5e64b9051da5f10e83c7a382195db4f98eeaa4c6034831e42f83c5f648850f472eec688e3a5f3d2beb7653d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libarchive python3.10dist(libarchive) python310-libarchive python3dist(libarchive)"
RDEPENDS:${PN} += "libarchive-devel python(abi)"

inherit rpm
