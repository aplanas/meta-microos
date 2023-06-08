SUMMARY = "Pure Python FIGlet implementation"
DESCRIPTION = "PyFIGlet is a full port of FIGlet (http://www.figlet.org/) into pure \
Python. It takes ASCII text and renders it in ASCII art fonts."
LICENSE = "MIT"

PV = "0.8.post1"

RPM_NAME = "python39-pyfiglet-0.8.post1-2.13.noarch.rpm"
RPM_HASH = "8f71b3087862e252f491720eacb58cd338d022a72b9576d6fec7ed8738461e595012f0efa6e742304e0394677815b4158482e38f72204cc02c33f8e9a6ba157b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyfiglet) python39-pyfiglet python3dist(pyfiglet)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
