SUMMARY = "Low-level library to interact with keepass databases"
DESCRIPTION = "This library allows you to write entries to a KeePass database"
LICENSE = "GPL-3.0-only"

PV = "4.0.3"

RPM_NAME = "python310-pykeepass-4.0.3-1.4.noarch.rpm"
RPM_HASH = "80835a638ff0b90750dab916eb8451b2f19f79cc607a5a38cb9992bbb5ffff19d77b4fc94839a26857ca57a1129f275d44ebf2d3c3b9884b120e4c67971e88c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pykeepass python3.10dist(pykeepass) python310-pykeepass python3dist(pykeepass)"
RDEPENDS:${PN} += "python(abi) python310-argon2-cffi python310-construct python310-future python310-lxml python310-pycryptodomex python310-python-dateutil"

inherit rpm
