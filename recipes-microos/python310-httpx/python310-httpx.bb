SUMMARY = "Python HTTP client with async support"
DESCRIPTION = "Python HTTP client with async support."
LICENSE = "BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "python310-httpx-0.24.0-1.1.noarch.rpm"
RPM_HASH = "6fd5331a0da39da4afd0d4a0c025f8947eebf2224cfd39282c1b265aec04cfad6ea488107494414d9a6d65cc62f785658ab01680ddddb83c2a6a42924c603b78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpx \
python3.10dist(httpx) \
python310-httpx \
python3dist(httpx)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-certifi \
python310-httpcore \
python310-idna \
python310-sniffio \
update-alternatives"

inherit rpm
