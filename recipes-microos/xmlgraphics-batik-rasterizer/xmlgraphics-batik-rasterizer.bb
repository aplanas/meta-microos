SUMMARY = "Batik SVG rasterizer"
DESCRIPTION = "The SVG Rasterizer is a utility that can convert SVG files to a raster \
format. The tool can convert individual files or sets of files, making \
it easy to convert entire directories of SVG files. The supported \
formats are JPEG, PNG, and TIFF, however the design allows new formats \
to be added easily."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-rasterizer-1.15-2.3.noarch.rpm"
RPM_HASH = "a08de8288f783a50aed29fff751d285fa78fd4a7f77300b687f4dace517e42acd60468ff1fac6f484b62b965d86dbb0d9c31e26b2f543b5d924b27442caa15d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-rasterizer \
config(xmlgraphics-batik-rasterizer) \
mvn(org.apache.xmlgraphics:batik-rasterizer) \
mvn(org.apache.xmlgraphics:batik-rasterizer-ext) \
mvn(org.apache.xmlgraphics:batik-rasterizer-ext:pom:) \
mvn(org.apache.xmlgraphics:batik-rasterizer:pom:) \
osgi(org.apache.batik.rasterizer) \
osgi(org.apache.batik.rasterizer-ext) \
xmlgraphics-batik-rasterizer"
RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
