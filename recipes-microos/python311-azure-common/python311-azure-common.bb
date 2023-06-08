SUMMARY = "Microsoft Azure common code"
DESCRIPTION = "This is the Microsoft Azure common code. \
 \
This package provides shared code by the Azure packages."
LICENSE = "MIT"

PV = "1.1.28"

RPM_NAME = "python311-azure-common-1.1.28-1.6.noarch.rpm"
RPM_HASH = "2b6abd252f69e454fc72d4788a259c02673310c0907d247bcef0bc89715978e9e02329b4af91b663f155e04716d61ee526706b7028a7aa353ad4270b167386cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-common) python311-azure-common python3dist(azure-common)"
RDEPENDS:${PN} += "python(abi) python311-azure-nspkg"

inherit rpm
