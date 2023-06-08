SUMMARY = "Minimal low-level Python HTTP client"
DESCRIPTION = "Python minimal low-level HTTP client."
LICENSE = "BSD-3-Clause"

PV = "0.16.3"

RPM_NAME = "python39-httpcore-0.16.3-2.1.noarch.rpm"
RPM_HASH = "b8e3e98c3124b0bc2dae20e4bfec8a97c6aa0ac94de74d5ae4485b6b59cf86488adda226bfb246715970fbdb5a9d49885246fb192d1ad717124f917ca5de3056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(httpcore) python39-httpcore python3dist(httpcore)"
RDEPENDS:${PN} += "(python39-anyio >= 3 with python39-anyio < 5) (python39-h11 >= 0.13.0 with python39-h11 < 0.15) (python39-sniffio >= 1.0 with python39-sniffio < 2) python(abi) python39-certifi"

inherit rpm
