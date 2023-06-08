SUMMARY = "Microsoft Azure AgriFood Farming client library"
DESCRIPTION = "FarmBeats is a B2B PaaS offering from Microsoft that makes it easy for AgriFood companies \
to build intelligent digital agriculture solutions on Azure. FarmBeats allows users to \
acquire, aggregate, and process agricultural data from various sources (farm equipment, \
weather, satellite) without the need to invest in deep data engineering resources. Customers \
can build SaaS solutions on top of FarmBeats and leverage first class support for model \
building to generate insights at scale. \
 \
Use FarmBeats client library for Python to do the following. \
 \
 * Create & update farmers, farms, fields, seasonal fields and boundaries. \
 * Ingest satellite and weather data for areas of interest. \
 * Ingest farm operations data covering tilling, planting, harvesting \
   and application of farm inputs."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-agrifood-farming-1.0.0b2-1.2.noarch.rpm"
RPM_HASH = "b9d8146a38ffe97599950154aa52b0ea3d0246a803a8f5c2eb4d19519622d6d0c25851577cd6489b591aba102c2d4e9806ffea808622461ae7583ce509c22720"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-agrifood-farming) python311-azure-agrifood-farming python3dist(azure-agrifood-farming)"
RDEPENDS:${PN} += "python(abi) python311-azure-agrifood-nspkg python311-azure-core python311-azure-nspkg python311-msrest python311-six"

inherit rpm
