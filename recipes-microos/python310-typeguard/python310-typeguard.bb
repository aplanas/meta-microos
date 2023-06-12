SUMMARY = "Library for runtime checking of Python types"
DESCRIPTION = "This library provides run-time type checking for functions defined with PEP 484 argument (and return) type annotations."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python310-typeguard-4.0.0-1.1.noarch.rpm"
RPM_HASH = "a29060718865b0df424a983112e5312ad7f4ea53c2e7ccefcb102b2540f3e41a06344ba8a551fd884883560849b744c9c11380a693edf3f2952ca6b1f2d01437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typeguard python3.10dist(typeguard) python310-typeguard python3dist(typeguard)"
RDEPENDS:${PN} += "python(abi) python310-importlib-metadata python310-typing-extensions"

inherit rpm
