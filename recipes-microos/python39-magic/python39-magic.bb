SUMMARY = "Python module to use libmagic"
DESCRIPTION = "This package contains the Python binding that require the magic 'file' \
interface."
LICENSE = "BSD-3-Clause & BSD-4-Clause"

PV = "5.44"

RPM_NAME = "python39-magic-5.44-2.1.aarch64.rpm"
RPM_HASH = "a503b9eb9da70e32559ac2b878bff3fe43c6aaebbe9fb684ea4ebb0eb69f3da688b4ed85fb50a5c27cc9396b0408cae2ed15ba45c26e335277e87a130ae5b71c"

RPROVIDES:${PN} += "python3.9dist(file-magic) python39-file-magic python39-magic python39-magic(aarch-64) python3dist(file-magic)"
RDEPENDS:${PN} += "libmagic1 python(abi)"

inherit rpm
