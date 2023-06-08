SUMMARY = "Python package providing assets pygaljs"
DESCRIPTION = "Python package providing assets from https://github.com/Kozea/pygal.js"
LICENSE = "GPL-3.0-or-later"

PV = "1.0.2"

RPM_NAME = "python39-pygaljs-1.0.2-2.1.noarch.rpm"
RPM_HASH = "9fff78d5e3f25ece1c0629af235bcaa0ff5410d3a78f98177635b3104ffebb2eccba242619099a7be8f60b57076d08b327c3377f857b5cd7f545a329193f7b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pygaljs) python39-pygaljs python3dist(pygaljs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
