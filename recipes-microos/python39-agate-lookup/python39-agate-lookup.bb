SUMMARY = "Remote lookup tables for agate"
DESCRIPTION = "Agate-lookup adds one-line access to lookup tables to agate."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python39-agate-lookup-0.3.1-2.7.noarch.rpm"
RPM_HASH = "27f5d685b1c24a1897b2c58d2623a3f2893dc08b16caad921c04a0f4982ca502049bc7d5f0e6d54dc447184c4e6a6d66a73932024b55043e04f46cb9a72bc881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(agate-lookup) \
python39-agate-lookup \
python3dist(agate-lookup)"
RDEPENDS:${PN} += "python(abi) \
python39-PyYAML \
python39-agate \
python39-requests"

inherit rpm
