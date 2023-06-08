SUMMARY = "Client for the Spotify Web API"
DESCRIPTION = "Spotipy is a Python library for the Spotify Web API. \
With Spotipy, the user gets access to the music data \
provided by the Spotify platform. \
 \
Documentation is available at \
https://spotipy.readthedocs.io/"
LICENSE = "MIT"

PV = "2.22.0"

RPM_NAME = "python311-spotipy-2.22.0-1.3.noarch.rpm"
RPM_HASH = "5a337b5a97fbb6ff4c809936a0344482adf952ccb320345e663b8300d0a8314a99beb05fcf9cf5b0e7d44f5895168114acbbe25380e424c6674f32d718f47c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(spotipy) python311-spotipy python3dist(spotipy)"
RDEPENDS:${PN} += "python(abi) python311-redis python311-requests python311-six python311-urllib3"

inherit rpm
