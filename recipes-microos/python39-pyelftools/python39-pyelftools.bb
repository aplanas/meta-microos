SUMMARY = "Library for analyzing ELF files and DWARF debugging information"
DESCRIPTION = "pyelftools is a pure python library for analyzing ELF files and DWARF debugging information"
LICENSE = "SUSE-Public-Domain"

PV = "0.29"

RPM_NAME = "python39-pyelftools-0.29-1.4.noarch.rpm"
RPM_HASH = "224dc380c35e3fc516176c6c82d4cddf052614e4a82db39e61bde1ac6f85c6a60aacef68c357575d08d5237eb4cfc460dae2a66513ee383f9b22485d812c7a35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyelftools) python39-pyelftools python3dist(pyelftools)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
