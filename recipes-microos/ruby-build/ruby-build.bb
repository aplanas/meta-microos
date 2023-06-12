SUMMARY = "Compile and install Ruby"
DESCRIPTION = "ruby-build provides a simple way to compile and install different versions of Ruby on UNIX-like systems."
LICENSE = "MIT"

PV = "20230512"

RPM_NAME = "ruby-build-20230512-1.1.noarch.rpm"
RPM_HASH = "5d7825ee8b442234a5fcf67ae1a3a658cd1c842c2f22a124b5889a2387c4fd32659394948aa4d05c840a6f71fb20f6b92b5b16ed11828a9f2d1f22f08d22e69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build"
RDEPENDS:${PN} += "/bin/bash bash curl gzip make tar"

inherit rpm
