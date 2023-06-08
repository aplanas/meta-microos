SUMMARY = "Varianter with combinatorial capabilities by PICT"
DESCRIPTION = "This plugin uses a third-party tool to provide variants created by \
Pair-Wise algorithms, also known as Combinatorial Independent Testing."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-varianter-pict-69.0-6.10.noarch.rpm"
RPM_HASH = "0ffb2edd3776ce785d4e483c3da69569e9df3e362dc234cdb419503e2403d23c7740445015ccbc91629d3744c684b7ba7d216c7bf1ff73a17e7e2274628b8160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-varianter-pict python3.10dist(avocado-framework-plugin-varianter-pict) python3dist(avocado-framework-plugin-varianter-pict)"
RDEPENDS:${PN} += "python(abi) python3-avocado"

inherit rpm
