SUMMARY = "leechcraft_messenger"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_messenger-20170319-1.15.aarch64.rpm"
RPM_HASH = "26e864ee44e54701aec305608ff8ebd5eac86a1c4df7307a0e2fca738a1cfa381e4812d56c95f1a935d4bbf7472e05be640c16036f8b6fe62c2e0d1181672279"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-leechcraft-leechcraft_messenger patterns-leechcraft-leechcraft_messenger(aarch-64)"
RDEPENDS:${PN} += "leechcraft-azoth pattern()"

inherit rpm
