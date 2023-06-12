SUMMARY = "Trello backup script"
DESCRIPTION = "This tool backups everything from Trello: \
 \
 * boards, open and closed, as JSON files \
 * lists, open and archived, as JSON files \
 * cards, open and archived, as JSON files \
 * attachments, downloaded as raw files \
 \
The script also creates a folder tree structure corresponding to \
the way data is organized. This is to make it more convenient to \
navigate locally between folders, as it mimics the flow from \
the web and mobile apps."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "trello-full-backup-0.3.1-1.12.noarch.rpm"
RPM_HASH = "645214622f93d913f591c7637bd999039ccfb4c238a4269d3a995e3ea4b7341e7c497a78e9fd736e00d61abb3c5fcc3d414d389d5b20387f19d80db739815888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(trello-full-backup) \
python3dist(trello-full-backup) \
trello-full-backup"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-requests"

inherit rpm
