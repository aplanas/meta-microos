SUMMARY = "Enhanced Base System"
DESCRIPTION = "The 32bit pattern complementing enhanced_base."
LICENSE = "MIT"

PV = "20200505"

RPM_NAME = "patterns-base-enhanced_base-32bit-20200505-41.1.aarch64.rpm"
RPM_HASH = "8b2e35f3425927934c47e75bd978ce745df810148d3719b1e0bfa723bf0dee906260d5b0d3eb98bb41ad2ab215ceedb3bbd5bb8a139a52300c0fec9bdf9bdd6f"

RPROVIDES:${PN} += "pattern() patterns-base-enhanced_base-32bit patterns-base-enhanced_base-32bit(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
