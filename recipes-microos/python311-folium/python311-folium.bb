SUMMARY = "Make beautiful maps with Leafletjs and Python"
DESCRIPTION = "Folium is a python library to make beautiful maps with Leafletsjs. Folium \
builds on the data wrangling strengths of the Python ecosystem and the mapping \
strengths of the Leaflet.js library. Manipulate your data in Python, then \
visualize it in a Leaflet map via folium."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-folium-0.14.0-2.2.noarch.rpm"
RPM_HASH = "a04de6c347ebaf2eebe77845cc8467c9be4273563574c04beeaeecd1185e2ae9a9546907015bbc1241fc6d003049c6cf19611953eb1e4f64e3cf27977c7c5fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(folium) python311-folium python3dist(folium)"
RDEPENDS:${PN} += "python(abi) python311-Jinja2 python311-branca python311-numpy python311-requests"

inherit rpm
