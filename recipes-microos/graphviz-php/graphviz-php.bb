SUMMARY = "PHP Extension for Graphviz"
DESCRIPTION = "The graphviz-php package contains the PHP extension for the graphviz \
tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "graphviz-php-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "b2d4cc2d28765fd6ed47418479a6d122c584bf86cc6cd5b99ef20b611a4ff5601d5c06ea4e894bde0f3c0cae5f1fcc99072937cb127601c273b47717c8ec1d22"

RPROVIDES:${PN} += "config(graphviz-php) graphviz-php graphviz-php(aarch-64) libgv_php.so()(64bit)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgvc.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) php(api) php(zend-abi) php8"

inherit rpm
