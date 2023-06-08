SUMMARY = "A fast Go linters runner"
DESCRIPTION = "golangci-lint is a fast Go linters runner. It runs linters in parallel, uses \
caching, supports yaml config, has integrations with all major IDE and has \
dozens of linters included."
LICENSE = "GPL-3.0-only"

PV = "1.52.2"

RPM_NAME = "golangci-lint-1.52.2-1.1.aarch64.rpm"
RPM_HASH = "aae65b91dee1686c03535c23a51486f8539ba5be1006e817505ef332b526cf956ec00a972e6066b149862e3a3868f15b60e55d90171e037553ececbcfe77ccfa"

RPROVIDES:${PN} += "golangci-lint golangci-lint(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
