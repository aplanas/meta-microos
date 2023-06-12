SUMMARY = "Client for the Spotify Web API"
DESCRIPTION = "Spotipy is a Python library for the Spotify Web API. \
With Spotipy, the user gets access to the music data \
provided by the Spotify platform. \
 \
Documentation is available at \
https://spotipy.readthedocs.io/"
LICENSE = "MIT"

PV = "2.22.0"

RPM_NAME = "python310-spotipy-2.22.0-1.3.noarch.rpm"
RPM_HASH = "94664f49efef9150d9d04199bd0cf89982c26280516b5e50d76f451b1249dd64acd4290348641f2cd6f775c6e5a73c7551d70355a7e875249b5641e6337bafdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spotipy \
python3.10dist(spotipy) \
python310-spotipy \
python3dist(spotipy)"
RDEPENDS:${PN} += "python(abi) \
python310-redis \
python310-requests \
python310-six \
python310-urllib3"

inherit rpm
