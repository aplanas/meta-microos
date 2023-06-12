SUMMARY = "Wrapper for data container objects"
DESCRIPTION = "The ItemAdapter class is a wrapper for data container objects, providing \
a common interface to handle objects of different types in an uniform \
manner, regardless of their underlying implementation."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python310-itemadapter-0.7.0-1.3.aarch64.rpm"
RPM_HASH = "78456479f66677dd40417e2fe66f284f1c031396adaa5d68ead75a4f9db7774305200c67d3da2d8ce2a343fde3704605caada33b7c646cefb8cf397483970211"

RPROVIDES:${PN} += "python3-itemadapter \
python3.10dist(itemadapter) \
python310-itemadapter \
python310-itemadapter(aarch-64) \
python3dist(itemadapter)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
