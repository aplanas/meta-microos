SUMMARY = "In-process task scheduler with Cron-like capabilities"
DESCRIPTION = "Advanced Python Scheduler (APScheduler) is an in-process task \
scheduler that lets you schedule jobs (functions or any python callables) to be \
executed at any time of your choosing. \
 \
This can be an alternative to externally run cron scripts for \
long-running applications (e.g. web applications), as it is platform neutral \
and can access the application's variables and functions. \
 \
APscheduler provides multiple job stores. \
 \
* Configurable scheduling mechanisms (triggers): \
  * Cron-like scheduling \
  * Delayed scheduling of single run jobs (like the UNIX 'at' command) \
  * Interval-based (run a job at specified time intervals) \
* Multiple, simultaneously active job stores: \
  * RAM \
  * File-based simple database (shelve) \
  * SQLAlchemy (any supported RDBMS works) \
  * MongoDB"
LICENSE = "MIT"

PV = "3.10.1"

RPM_NAME = "python310-APScheduler-3.10.1-1.3.noarch.rpm"
RPM_HASH = "3897befa7eaec930841e8211163619f05e49c1b66bb4e609e67183738589f69b14fbb8c9daf32ab62d90f8ec638a7d61d1ccda1f98419c5f668c8173227eb14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-APScheduler \
python3.10dist(apscheduler) \
python310-APScheduler \
python3dist(apscheduler)"
RDEPENDS:${PN} += "python(abi) \
python310-pytz \
python310-six \
python310-tzlocal"

inherit rpm
