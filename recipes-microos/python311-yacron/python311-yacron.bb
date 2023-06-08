SUMMARY = "Docker-friendly Cron replacement"
DESCRIPTION = "A modern Cron replacement that is Docker-friendly."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python311-yacron-0.17.0-1.5.noarch.rpm"
RPM_HASH = "390bf511c06469df704b9df20dcf22d5735b2ed1fc2773fe1683444cd3a3376e49d0c087c052935a4447df22e9e314347a2b766c38516085e2290e2bb3a7a373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(yacron) python311-yacron python3dist(yacron)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Jinja2 python311-aiohttp python311-aiosmtplib python311-crontab python311-pytz python311-ruamel.yaml python311-sentry-sdk python311-strictyaml update-alternatives"

inherit rpm
