SUMMARY = "Python module for calculating the WHOIS Similarity Distance"
DESCRIPTION = "This algorithm allows you to determine a numeric distance between two given domains, using their WHOIS information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-whois_similarity_distance-1.0.2-8.4.noarch.rpm"
RPM_HASH = "73a7c90af4f77146806f0eb9ae835166127c697116d0fc9444c6c1584df5ca62c8a31c2bc33b6cbd1e48c1a984450e08c50b89a1a32d8bc4484bbd1c9a9a6ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(whois-similarity-distance) \
python39-whois_similarity_distance \
python3dist(whois-similarity-distance)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-Levenshtein \
python39-certifi \
python39-chardet \
python39-ez_setup \
python39-future \
python39-idna \
python39-numpy \
python39-python-dateutil \
python39-pythonwhois \
python39-requests \
python39-scikit-learn \
python39-scipy \
python39-six \
python39-texttable \
python39-tld \
python39-urllib3 \
update-alternatives"

inherit rpm
