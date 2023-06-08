SUMMARY = "Python package to convert accurately between Hijri and Gregorian dates"
DESCRIPTION = "A Python package to convert accurately between Hijri and Gregorian dates using the Umm al-Qura calendar of Saudi Arabia."
LICENSE = "MIT"

PV = "2.2.4"

RPM_NAME = "python39-hijri-converter-2.2.4-1.2.noarch.rpm"
RPM_HASH = "55bbaad447b973022f5eaa613a2ef2097effcbd65a3fb2aa3012af7ec93c7c53e4a1c7791baa2d4aeed3222cb8797df5502e0fb4331f8f32cbeaa8e7231ba441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hijri-converter) python39-hijri-converter python3dist(hijri-converter)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
