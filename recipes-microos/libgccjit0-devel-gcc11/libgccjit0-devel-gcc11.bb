SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "libgccjit0-devel-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "31597b6db13c49cbfd6b7392bab201a928bfd5465ac864d5eba26d28a737dd92ccf707f48b3c8d5e1f20ddcb9bfd162304a81ce37ae4a83de5e55d112d3fda84"

RPROVIDES:${PN} += "libgccjit0-devel libgccjit0-devel-gcc11 libgccjit0-devel-gcc11(aarch-64)"
RDEPENDS:${PN} += "libgccjit0-gcc11"

inherit rpm
