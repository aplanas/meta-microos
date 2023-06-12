SUMMARY = "Python package to check if a file is binary or text"
DESCRIPTION = "Pure Python package to guess whether a file is binary or text, \
using a heuristic similar to Perl's pp_fttext and its analysis \
by eliben."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python310-binaryornot-0.4.4-4.1.noarch.rpm"
RPM_HASH = "3c41023f57eb297cfbffeb69e62b517af4dc7e78931194902375d249252945865af3ca3b7ac6f32bb93d022c7d8c8e559f9a8c2ec180d1c77078f1f8bb6d5298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-binaryornot \
python3.10dist(binaryornot) \
python310-binaryornot \
python3dist(binaryornot)"
RDEPENDS:${PN} += "python(abi) \
python310-chardet"

inherit rpm
