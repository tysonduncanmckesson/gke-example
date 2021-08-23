#!/usr/bin/env bash

fly -t kafka-admin set-pipeline -c devops/concourse/pipeline.yaml -p gke-example -l devops/concourse/params.yaml
