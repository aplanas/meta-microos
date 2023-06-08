SUMMARY = "Docker-friendly Cron replacement"
DESCRIPTION = "A modern Cron replacement that is Docker-friendly."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python310-yacron-0.17.0-1.5.noarch.rpm"
RPM_HASH = "4325cb0d88a8e41064ed833ef4c62a4978a6036c2c3b560cbd1fe6ebda43f0f03b348807b0bb34666ec2fe2255323984cc2bdf492920e39c8187a329b92531db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yacron python3.10dist(yacron) python310-yacron python3dist(yacron)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Jinja2 python310-aiohttp python310-aiosmtplib python310-crontab python310-pytz python310-ruamel.yaml python310-sentry-sdk python310-strictyaml update-alternatives"

inherit rpm
