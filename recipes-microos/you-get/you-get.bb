SUMMARY = "Dumb downloader that scrapes the web"
DESCRIPTION = "You-Get is a command-line utility to download media contents \
(videos, audios, images) from the Web, in case there is no other \
handy way to do it."
LICENSE = "MIT"

PV = "0.4.1650"

RPM_NAME = "you-get-0.4.1650-1.2.noarch.rpm"
RPM_HASH = "ed89a619a2e52aac795841737beaa29cda6dc6dea3a2c0d26a83aa70f18c9052d9e532010177d09b2b3bf4c47705cfcdde26069f49983f911cd4013ce75c2536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(you-get) python3dist(you-get) you-get"
RDEPENDS:${PN} += "/usr/bin/python3 ffmpeg python(abi)"

inherit rpm
