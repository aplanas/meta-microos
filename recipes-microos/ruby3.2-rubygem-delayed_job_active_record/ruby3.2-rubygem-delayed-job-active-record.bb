SUMMARY = "ActiveRecord backend for DelayedJob"
DESCRIPTION = "ActiveRecord backend for Delayed::Job, originally authored by Tobias Lütke."
LICENSE = "MIT"

PV = "4.1.7"

RPM_NAME = "ruby3.2-rubygem-delayed_job_active_record-4.1.7-1.9.aarch64.rpm"
RPM_HASH = "e41b178e9a36913bb185a5589eeb2b8c75f5a0a2cf8bf2644d7a49c37c7e72ca55c1b2743d2d0166967513b220297b59e99fb74f242096ef7ae25b0490db9d7b"

RPROVIDES:${PN} += "ruby3.2-rubygem-delayed_job_active_record \
ruby3.2-rubygem-delayed_job_active_record(aarch-64) \
rubygem(delayed_job_active_record) \
rubygem(ruby:3.2.0:delayed_job_active_record) \
rubygem(ruby:3.2.0:delayed_job_active_record:4) \
rubygem(ruby:3.2.0:delayed_job_active_record:4.1) \
rubygem(ruby:3.2.0:delayed_job_active_record:4.1.7)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:activerecord) \
rubygem(ruby:3.2.0:delayed_job)"

inherit rpm
