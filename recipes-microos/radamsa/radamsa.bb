SUMMARY = "A test case generator for robustness testing, aka a fuzzer"
DESCRIPTION = "Radamsa is a test case generator for robustness testing, aka a fuzzer. It \
can be used to test how well a program can stand malformed and potentially \
malicious inputs. It operates based on given sample inputs and thus \
requires minimal effort to set up. The main selling points of radamsa are \
that it is easy to use, contains several old and new fuzzing algorithms, is \
easy to script from command line and has already been used to find a slew \
of bugs in programs that actually matter."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "radamsa-0.6-1.3.aarch64.rpm"
RPM_HASH = "bc7e475245da414f369ec79aaec03054b3be634272f61f8e09ab6872b162d032bc24a70b60ebeb1a5ba8ac353cb4d7bc0d7c795a483ceae99a36860a8e4a119a"

RPROVIDES:${PN} += "radamsa \
radamsa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
