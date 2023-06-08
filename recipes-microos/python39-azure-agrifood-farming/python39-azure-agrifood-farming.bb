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

RPM_NAME = "python39-azure-agrifood-farming-1.0.0b2-1.2.noarch.rpm"
RPM_HASH = "310dfbe8cfc10b78c78ab2573974948cc4ab2c553ae87b05fe3e2f536c2d1c9c87f520f9367001156d795b23cd474d3f2a50ad5e88a97623a9a30c76070b10bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-agrifood-farming) python39-azure-agrifood-farming python3dist(azure-agrifood-farming)"
RDEPENDS:${PN} += "python(abi) python39-azure-agrifood-nspkg python39-azure-core python39-azure-nspkg python39-msrest python39-six"

inherit rpm
