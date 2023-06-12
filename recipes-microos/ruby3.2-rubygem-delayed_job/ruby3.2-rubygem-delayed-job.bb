SUMMARY = "Database-backed asynchronous priority queue system -- Extracted from"
DESCRIPTION = "Delayed_job (or DJ) encapsulates the common pattern of asynchronously \
executing longer tasks in the background. It is a direct extraction from \
Shopify where the job table is responsible for a multitude of core tasks."
LICENSE = "MIT"

PV = "4.1.11"

RPM_NAME = "ruby3.2-rubygem-delayed_job-4.1.11-1.5.aarch64.rpm"
RPM_HASH = "7e7179b777b8c3cd6e31063d794758e4e8709e41cb3db12bcb00de53d4ab8ec66802bbf2f0ce031fad87c65df7270f3e234d844ab338c9a2b14293be97a3ae74"

RPROVIDES:${PN} += "ruby3.2-rubygem-delayed_job \
ruby3.2-rubygem-delayed_job(aarch-64) \
rubygem(delayed_job) \
rubygem(ruby:3.2.0:delayed_job) \
rubygem(ruby:3.2.0:delayed_job:4) \
rubygem(ruby:3.2.0:delayed_job:4.1) \
rubygem(ruby:3.2.0:delayed_job:4.1.11)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activesupport)"

inherit rpm
