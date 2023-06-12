SUMMARY = "Python module for calculating the WHOIS Similarity Distance"
DESCRIPTION = "This algorithm allows you to determine a numeric distance between two given domains, using their WHOIS information."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-whois_similarity_distance-1.0.2-8.4.noarch.rpm"
RPM_HASH = "3f22c8c03f753cb2433abae0f4907c6373c3a2760c8f8cae3fc3f22e845ecd83f07a8b822b914e72ff71da1d9ea6570bf1c097afe8bfef2687a48af43200673b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whois_similarity_distance \
python3.10dist(whois-similarity-distance) \
python310-whois_similarity_distance \
python3dist(whois-similarity-distance)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Levenshtein \
python310-certifi \
python310-chardet \
python310-ez_setup \
python310-future \
python310-idna \
python310-numpy \
python310-python-dateutil \
python310-pythonwhois \
python310-requests \
python310-scikit-learn \
python310-scipy \
python310-six \
python310-texttable \
python310-tld \
python310-urllib3 \
update-alternatives"

inherit rpm
