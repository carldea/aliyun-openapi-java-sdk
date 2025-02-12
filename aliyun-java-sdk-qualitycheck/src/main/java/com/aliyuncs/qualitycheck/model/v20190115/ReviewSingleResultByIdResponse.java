/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ReviewSingleResultByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ReviewSingleResultByIdResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String audioURL;

		private Integer hitNumber;

		private String nextVid;

		private String preVid;

		private Boolean isAudio;

		private Integer asrWordsCount;

		private Boolean audio;

		private Integer totalScore;

		private Integer businessType;

		private String fileMergeName;

		private Boolean isDeleted;

		private Boolean deleted;

		private Integer vid;

		private Integer reviewNumber;

		private List<Dialogue> dialogues;

		private List<ScorePo> handScoreInfoList;

		private List<HitRuleReviewInfo> hitRuleReviewInfoList;

		private List<String> manualScoreMappingList;

		public String getAudioURL() {
			return this.audioURL;
		}

		public void setAudioURL(String audioURL) {
			this.audioURL = audioURL;
		}

		public Integer getHitNumber() {
			return this.hitNumber;
		}

		public void setHitNumber(Integer hitNumber) {
			this.hitNumber = hitNumber;
		}

		public String getNextVid() {
			return this.nextVid;
		}

		public void setNextVid(String nextVid) {
			this.nextVid = nextVid;
		}

		public String getPreVid() {
			return this.preVid;
		}

		public void setPreVid(String preVid) {
			this.preVid = preVid;
		}

		public Boolean getIsAudio() {
			return this.isAudio;
		}

		public void setIsAudio(Boolean isAudio) {
			this.isAudio = isAudio;
		}

		public Integer getAsrWordsCount() {
			return this.asrWordsCount;
		}

		public void setAsrWordsCount(Integer asrWordsCount) {
			this.asrWordsCount = asrWordsCount;
		}

		public Boolean getAudio() {
			return this.audio;
		}

		public void setAudio(Boolean audio) {
			this.audio = audio;
		}

		public Integer getTotalScore() {
			return this.totalScore;
		}

		public void setTotalScore(Integer totalScore) {
			this.totalScore = totalScore;
		}

		public Integer getBusinessType() {
			return this.businessType;
		}

		public void setBusinessType(Integer businessType) {
			this.businessType = businessType;
		}

		public String getFileMergeName() {
			return this.fileMergeName;
		}

		public void setFileMergeName(String fileMergeName) {
			this.fileMergeName = fileMergeName;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public Integer getVid() {
			return this.vid;
		}

		public void setVid(Integer vid) {
			this.vid = vid;
		}

		public Integer getReviewNumber() {
			return this.reviewNumber;
		}

		public void setReviewNumber(Integer reviewNumber) {
			this.reviewNumber = reviewNumber;
		}

		public List<Dialogue> getDialogues() {
			return this.dialogues;
		}

		public void setDialogues(List<Dialogue> dialogues) {
			this.dialogues = dialogues;
		}

		public List<ScorePo> getHandScoreInfoList() {
			return this.handScoreInfoList;
		}

		public void setHandScoreInfoList(List<ScorePo> handScoreInfoList) {
			this.handScoreInfoList = handScoreInfoList;
		}

		public List<HitRuleReviewInfo> getHitRuleReviewInfoList() {
			return this.hitRuleReviewInfoList;
		}

		public void setHitRuleReviewInfoList(List<HitRuleReviewInfo> hitRuleReviewInfoList) {
			this.hitRuleReviewInfoList = hitRuleReviewInfoList;
		}

		public List<String> getManualScoreMappingList() {
			return this.manualScoreMappingList;
		}

		public void setManualScoreMappingList(List<String> manualScoreMappingList) {
			this.manualScoreMappingList = manualScoreMappingList;
		}

		public static class Dialogue {

			private String words;

			private String identity;

			private Long begin;

			private Long beginTime;

			private Integer emotionValue;

			private Long end;

			private Integer speechRate;

			private String role;

			private Integer silenceDuration;

			private String hourMinSec;

			public String getWords() {
				return this.words;
			}

			public void setWords(String words) {
				this.words = words;
			}

			public String getIdentity() {
				return this.identity;
			}

			public void setIdentity(String identity) {
				this.identity = identity;
			}

			public Long getBegin() {
				return this.begin;
			}

			public void setBegin(Long begin) {
				this.begin = begin;
			}

			public Long getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Long beginTime) {
				this.beginTime = beginTime;
			}

			public Integer getEmotionValue() {
				return this.emotionValue;
			}

			public void setEmotionValue(Integer emotionValue) {
				this.emotionValue = emotionValue;
			}

			public Long getEnd() {
				return this.end;
			}

			public void setEnd(Long end) {
				this.end = end;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getSilenceDuration() {
				return this.silenceDuration;
			}

			public void setSilenceDuration(Integer silenceDuration) {
				this.silenceDuration = silenceDuration;
			}

			public String getHourMinSec() {
				return this.hourMinSec;
			}

			public void setHourMinSec(String hourMinSec) {
				this.hourMinSec = hourMinSec;
			}
		}

		public static class ScorePo {

			private Long scoreId;

			private String scoreName;

			private List<ScoreParam> scoreInfos;

			public Long getScoreId() {
				return this.scoreId;
			}

			public void setScoreId(Long scoreId) {
				this.scoreId = scoreId;
			}

			public String getScoreName() {
				return this.scoreName;
			}

			public void setScoreName(String scoreName) {
				this.scoreName = scoreName;
			}

			public List<ScoreParam> getScoreInfos() {
				return this.scoreInfos;
			}

			public void setScoreInfos(List<ScoreParam> scoreInfos) {
				this.scoreInfos = scoreInfos;
			}

			public static class ScoreParam {

				private String scoreSubName;

				private Integer scoreNum;

				private Integer hit;

				private Long scoreSubId;

				private Integer scoreType;

				public String getScoreSubName() {
					return this.scoreSubName;
				}

				public void setScoreSubName(String scoreSubName) {
					this.scoreSubName = scoreSubName;
				}

				public Integer getScoreNum() {
					return this.scoreNum;
				}

				public void setScoreNum(Integer scoreNum) {
					this.scoreNum = scoreNum;
				}

				public Integer getHit() {
					return this.hit;
				}

				public void setHit(Integer hit) {
					this.hit = hit;
				}

				public Long getScoreSubId() {
					return this.scoreSubId;
				}

				public void setScoreSubId(Long scoreSubId) {
					this.scoreSubId = scoreSubId;
				}

				public Integer getScoreType() {
					return this.scoreType;
				}

				public void setScoreType(Integer scoreType) {
					this.scoreType = scoreType;
				}
			}
		}

		public static class HitRuleReviewInfo {

			private Integer ruleScoreType;

			private Integer ruleType;

			private Integer autoReview;

			private Long scoreSubId;

			private String comments;

			private Integer totalNumber;

			private Long scoreId;

			private String ruleName;

			private Long rid;

			private List<ConditionHitInfo> conditionHitInfoList;

			private ReviewInfo reviewInfo;

			public Integer getRuleScoreType() {
				return this.ruleScoreType;
			}

			public void setRuleScoreType(Integer ruleScoreType) {
				this.ruleScoreType = ruleScoreType;
			}

			public Integer getRuleType() {
				return this.ruleType;
			}

			public void setRuleType(Integer ruleType) {
				this.ruleType = ruleType;
			}

			public Integer getAutoReview() {
				return this.autoReview;
			}

			public void setAutoReview(Integer autoReview) {
				this.autoReview = autoReview;
			}

			public Long getScoreSubId() {
				return this.scoreSubId;
			}

			public void setScoreSubId(Long scoreSubId) {
				this.scoreSubId = scoreSubId;
			}

			public String getComments() {
				return this.comments;
			}

			public void setComments(String comments) {
				this.comments = comments;
			}

			public Integer getTotalNumber() {
				return this.totalNumber;
			}

			public void setTotalNumber(Integer totalNumber) {
				this.totalNumber = totalNumber;
			}

			public Long getScoreId() {
				return this.scoreId;
			}

			public void setScoreId(Long scoreId) {
				this.scoreId = scoreId;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public Long getRid() {
				return this.rid;
			}

			public void setRid(Long rid) {
				this.rid = rid;
			}

			public List<ConditionHitInfo> getConditionHitInfoList() {
				return this.conditionHitInfoList;
			}

			public void setConditionHitInfoList(List<ConditionHitInfo> conditionHitInfoList) {
				this.conditionHitInfoList = conditionHitInfoList;
			}

			public ReviewInfo getReviewInfo() {
				return this.reviewInfo;
			}

			public void setReviewInfo(ReviewInfo reviewInfo) {
				this.reviewInfo = reviewInfo;
			}

			public static class ConditionHitInfo {

				private List<KeyWord> keyWords;

				private List<String> cid;

				private Phrase phrase;

				public List<KeyWord> getKeyWords() {
					return this.keyWords;
				}

				public void setKeyWords(List<KeyWord> keyWords) {
					this.keyWords = keyWords;
				}

				public List<String> getCid() {
					return this.cid;
				}

				public void setCid(List<String> cid) {
					this.cid = cid;
				}

				public Phrase getPhrase() {
					return this.phrase;
				}

				public void setPhrase(Phrase phrase) {
					this.phrase = phrase;
				}

				public static class KeyWord {

					private Integer to;

					private Integer from;

					private String val;

					private String tid;

					private Integer pid;

					public Integer getTo() {
						return this.to;
					}

					public void setTo(Integer to) {
						this.to = to;
					}

					public Integer getFrom() {
						return this.from;
					}

					public void setFrom(Integer from) {
						this.from = from;
					}

					public String getVal() {
						return this.val;
					}

					public void setVal(String val) {
						this.val = val;
					}

					public String getTid() {
						return this.tid;
					}

					public void setTid(String tid) {
						this.tid = tid;
					}

					public Integer getPid() {
						return this.pid;
					}

					public void setPid(Integer pid) {
						this.pid = pid;
					}
				}

				public static class Phrase {

					private String words;

					private Long begin;

					private String identity;

					private Integer pid;

					private Integer emotionValue;

					private Long end;

					private String role;

					public String getWords() {
						return this.words;
					}

					public void setWords(String words) {
						this.words = words;
					}

					public Long getBegin() {
						return this.begin;
					}

					public void setBegin(Long begin) {
						this.begin = begin;
					}

					public String getIdentity() {
						return this.identity;
					}

					public void setIdentity(String identity) {
						this.identity = identity;
					}

					public Integer getPid() {
						return this.pid;
					}

					public void setPid(Integer pid) {
						this.pid = pid;
					}

					public Integer getEmotionValue() {
						return this.emotionValue;
					}

					public void setEmotionValue(Integer emotionValue) {
						this.emotionValue = emotionValue;
					}

					public Long getEnd() {
						return this.end;
					}

					public void setEnd(Long end) {
						this.end = end;
					}

					public String getRole() {
						return this.role;
					}

					public void setRole(String role) {
						this.role = role;
					}
				}
			}

			public static class ReviewInfo {

				private Long rid;

				private String hitId;

				public Long getRid() {
					return this.rid;
				}

				public void setRid(Long rid) {
					this.rid = rid;
				}

				public String getHitId() {
					return this.hitId;
				}

				public void setHitId(String hitId) {
					this.hitId = hitId;
				}
			}
		}
	}

	@Override
	public ReviewSingleResultByIdResponse getInstance(UnmarshallerContext context) {
		return	ReviewSingleResultByIdResponseUnmarshaller.unmarshall(this, context);
	}
}
