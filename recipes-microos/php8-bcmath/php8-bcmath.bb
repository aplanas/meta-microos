SUMMARY = "'Binary Calculator' extension for PHP"
DESCRIPTION = "Binary Calculator which supports numbers of any size and precision, \
represented as strings."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-bcmath-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "dd914fd6306819cc0048729f01b440945d6dac1591d9bdf866f3cc7b4d9c8b96df443f58887f38261ffd1275331e828a86f56c7f8d056d96dfaef6ed34a14171"

RPROVIDES:${PN} += "config(php8-bcmath) php-bcmath php8-bcmath php8-bcmath(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php"

inherit rpm
