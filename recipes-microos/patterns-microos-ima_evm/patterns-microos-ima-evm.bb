SUMMARY = "IMA/EVM Support"
DESCRIPTION = "Packages required to enable IMA/EVM on openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ima_evm-5.0-69.1.aarch64.rpm"
RPM_HASH = "3daf06fdc879228343be28ddabd2e9fa35adc1454fafd1e91ee1e3723e62d205726fb46d2b449a1a296dabc8d98d8aed3abf4c0dc1ecec683609f950459ee519"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-ima_evm patterns-microos-ima_evm(aarch-64)"
RDEPENDS:${PN} += "attr dracut-ima ima-evm-utils keyutils"

inherit rpm
